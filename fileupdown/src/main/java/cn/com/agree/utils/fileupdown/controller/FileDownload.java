package cn.com.agree.utils.fileupdown.controller;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;

/**
 * @author ：liugeng
 * @date ：Created in 2021/3/1 10:55
 */
public class FileDownload {
    public static void main(String[] args) throws FileNotFoundException {
        HttpServletResponse response = null;
        try {
            new FileDownload().fileDown3(response);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    //给定文件的下载路径
    public HttpServletResponse fileDown1(String path, HttpServletResponse response) throws IOException {
        File file = new File(path);
        String fileName = file.getName();
        String ext = fileName.substring(fileName.indexOf(".")+1).toUpperCase(Locale.ROOT);
        InputStream fis = new BufferedInputStream(new FileInputStream(path));
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        response.reset();
        response.addHeader("Content-Disposition","attachName;fileName"+new String(fileName.getBytes()));
        response.addHeader("Content-length",""+file.length());
        OutputStream ois = new BufferedOutputStream(response.getOutputStream());
        response.setContentType("application/octet-stream");
        ois.write(buffer);
        ois.flush();
        ois.close();
        return response;
    }
    //从本地下载文件
    public  void fileDown2(HttpServletResponse response) throws FileNotFoundException {
        String fileName = "test.txt";
        FileInputStream fis = new FileInputStream("D:/test.txt");
        response.reset();
        response.setContentType("bin");
        response.setHeader("Content-Disposition","attachment;filename\""+fileName+"\"");
        byte[] b =new byte[100];
        int len;
        try{
            while ((len = fis.read(b))>0){
                response.getOutputStream().write(b,0,len);

            }
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
        } ;
    }

    //从网络上下载文件
    public void fileDown3(HttpServletResponse response) throws MalformedURLException {
        int bytesum = 0;
        int byteread = 0;
        try {
            URL url = new URL("https://gitee.com/Eternity-LG/picture/raw/master/labtop/20210407143025.png");
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            FileOutputStream fos = new FileOutputStream("D:/abc.gif");
            byte[] buffer = new byte[1024];
            System.out.println();
            int len;
            while ((byteread=is.read(buffer))!=-1){
                System.out.print(byteread+" ");
                bytesum +=byteread;
                System.out.println(bytesum);
                fos.write(buffer,0,byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
