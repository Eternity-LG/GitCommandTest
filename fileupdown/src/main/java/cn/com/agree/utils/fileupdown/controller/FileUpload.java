package cn.com.agree.utils.fileupdown.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.print.DocFlavor;
import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;
import java.util.Iterator;

/**
 * @author ：liugeng
 * @date ：Created in 2021/2/26 16:01
 */
@Component
public class FileUpload {
    @RequestMapping("upload")
    public String fileupLoad(@RequestParam("file")CommonsMultipartFile file) throws IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("filename"+file.getOriginalFilename());
        try {
            OutputStream fileOS = new FileOutputStream(new StringBuilder().append("D:/").append(System.currentTimeMillis()).append(file.getOriginalFilename()).toString());
            InputStream fileIS = file.getInputStream();
            System.out.println(fileIS);
            int temp;
            while ((temp=fileIS.read())!=-1){
                fileOS.write(temp);
            }
            fileOS.flush();
            fileOS.close();
            fileIS.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();

        System.out.println("方法三的运行时间："+String.valueOf(endTime-startTime)+"ms");

        return "/success";
    }
    public String fileupLoad2(@RequestParam("file")CommonsMultipartFile file) throws IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("filename"+file.getOriginalFilename());
        try {
            String path = new StringBuilder().append("D:/").append(System.currentTimeMillis()).append(file.getOriginalFilename()).toString();
            File destination = new File(path);
            file.transferTo(destination);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();

        System.out.println("方法三的运行时间："+String.valueOf(endTime-startTime)+"ms");

        return "/success";
    }
    public String fileupLoad3(HttpServletRequest request) throws IOException {
        long startTime = System.currentTimeMillis();
        CommonsMultipartResolver MultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        if (MultipartResolver.isMultipart(request)){
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            Iterator iter = multiRequest.getFileNames();
            while (iter.hasNext()){
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if(file!=null)
                {
                    String path=new StringBuilder().append("D:/").append(System.currentTimeMillis()).append(file.getOriginalFilename()).toString();
                    file.transferTo(new File(path));
                }
            }
        }
        long endTime=System.currentTimeMillis();

        System.out.println("方法三的运行时间："+String.valueOf(endTime-startTime)+"ms");

        return "/success";
    }
}
