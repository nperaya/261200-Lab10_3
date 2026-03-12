// Interface สำหรับ handler ทุกตัวใน chain
public interface Handler {

    // กำหนด handler ตัวถัดไปใน chain
    void setHandler(Handler handler);

    // method ประมวลผลไฟล์
    void process(File file);

    // คืนชื่อ handler
    String getHandlerName();
}
