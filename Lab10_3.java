public class Lab10_3 {

    public static void main(String[] args) {

        //สร้าง handlers
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler documentHandler = new DocumentFileHandler("Document Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        //สร้าง chain
        textHandler.setHandler(documentHandler);
        documentHandler.setHandler(imageHandler);

        //สร้างไฟล์ตัวอย่าง
        File textFile = new File("README.txt", "text", "/home/docs");
        File docFile = new File("Document.doc", "document", "/home/docs");
        File imageFile = new File("Picture.jpg", "image", "/home/images");
        File audioFile = new File("Song.mp3", "audio", "/home/audio");

        //ทดสอบ
        System.out.println("Processing text file:");
        textHandler.process(textFile);

        System.out.println("\nProcessing document file:");
        textHandler.process(docFile);

        System.out.println("\nProcessing image file:");
        textHandler.process(imageFile);

        System.out.println("\nProcessing audio file:");
        textHandler.process(audioFile);
    }
}
