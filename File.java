// class เก็บข้อมูลไฟล์
public class File {

    private String fileName;
    private String fileType;
    private String filePath;

    //constructor
    public File(String fileName, String fileType, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    // getter
    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getFilePath() {
        return filePath;
    }
}
