// Handler สำหรับไฟล์ประเภท text
public class TextFileHandler implements Handler {

    private Handler handler;      // handler ตัวถัดไป
    private String handlerName;   // ชื่อ handler

    public TextFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }

    @Override
    public void process(File file) {

        if (file.getFileType().equals("text")) {
            System.out.println("Process text file by " + handlerName);
        }
        else if (handler != null) {
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            handler.process(file);
        }
        else {
            System.out.println("File type not supported");
        }
    }
}
