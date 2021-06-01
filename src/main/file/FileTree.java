package main.file;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/1 15:49
 */
public class FileTree {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        getFileList("D:\\test", lists);
        System.out.println(lists);
    }

    private static void getFileList(String filePath, ArrayList lists) {
        File fileAll = new File(filePath);

        HashMap<String, Object> DirMap = new HashMap<>();
        File[] subFilePath = fileAll.listFiles();
        for (File file : subFilePath) {
            if (file.isDirectory()) {
                ArrayList<HashMap<String, Object>> list = new ArrayList<>();
                DirMap.put(file.getName(), list);
                getFileList(file.getAbsolutePath(), list);
            } else {
                DirMap.put(file.getName(), file.getAbsolutePath());

            }
        }
        lists.add(DirMap);
    }
}