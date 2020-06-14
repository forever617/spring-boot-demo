package com.leo.studentManager.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadUtil {
    private static Path rootPath = Paths.get("/Users/leohengwang/code/TempFile");
    public static void uploadCsv(MultipartFile file) {
        String csvPath = "./student/csv";
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        Path filePath = rootPath.resolve(csvPath).resolve(fileName);
        File dest = new File(filePath.toString());
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            // 保存到服务器中
            file.transferTo(dest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
