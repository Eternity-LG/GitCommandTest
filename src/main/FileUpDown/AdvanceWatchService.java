package main.FileUpDown;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.LinkedList;

/**
 * @author ：liugeng
 * @date ：Created in 2021/3/3 17:21
 */
public class AdvanceWatchService {
    public static void main(String[] args) {
        File file = new File("D:\test");
        Path parentPath = file.toPath();
        WatchService watchService;

        {
            try {
                watchService = FileSystems.getDefault().newWatchService();
                parentPath.register(watchService,
                        StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_DELETE,
                        StandardWatchEventKinds.ENTRY_MODIFY);
                LinkedList<File> listfile = new LinkedList<>();
                listfile.add(file);
                while (listfile.size() > 0) {
                    File f = listfile.removeFirst();
                    File[] files = f.listFiles();
                    for (File f1 : files) {
                        if (f1.isDirectory()) {
                            listfile.add(f1);
                            f1.toPath().register(watchService,
                                    StandardWatchEventKinds.ENTRY_CREATE,
                                    StandardWatchEventKinds.ENTRY_DELETE,
                                    StandardWatchEventKinds.ENTRY_MODIFY);
                        }
                    }
                }
                new Thread(() -> {
                    while (true) {
                        WatchKey key = null;
                        try {
                            key = watchService.take();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        for (WatchEvent event : key.pollEvents()) {
                            Path file2 = (Path) event.context();
                            String str = file2.toFile().getAbsolutePath();
                            System.out.println(str + " " + event.kind().toString());

                        }
                        key.reset();
                    }
                }).start();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
