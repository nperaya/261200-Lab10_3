// Handler สำหรับไฟล์ประเภท document
public class DocumentFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public DocumentFileHandler(String handlerName) {
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

        if (file.getFileType().equals("document")) {
            System.out.println("Process document file by " + handlerName);
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
