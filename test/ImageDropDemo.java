package test;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.io.File;
import java.util.List;

public class ImageDropDemo extends JFrame {

    public ImageDropDemo() {
        setTitle("Drag and Drop Image Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // สร้าง JPanel สำหรับรับการ Drag and Drop
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Drag and drop an image here", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(label, BorderLayout.CENTER);
        add(panel);

        // ตั้งค่า DropTarget ให้กับ JPanel
        new DropTarget(panel, new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragExit(DropTargetEvent dte) {
            }

            @Override
            public void drop(DropTargetDropEvent dtde) {
                try {
                    // ตรวจสอบว่าเป็นไฟล์ที่ถูกลากและวาง
                    if (dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                        dtde.acceptDrop(DnDConstants.ACTION_COPY);

                        // ดึงไฟล์ที่ถูกลากและวาง
                        List<File> droppedFiles = (List<File>) dtde.getTransferable()
                                .getTransferData(DataFlavor.javaFileListFlavor);

                        // ตรวจสอบไฟล์แรกเท่านั้น
                        File file = droppedFiles.get(0);
                        String filePath = file.getAbsolutePath();

                        // แสดงพาธของรูปภาพในคอนโซล
                        System.out.println("Image file path: " + filePath);

                        // แสดงรูปภาพใน JPanel (ถ้าเป็นไฟล์รูปภาพ)
                        if (filePath.endsWith(".jpg") || filePath.endsWith(".jpeg") || filePath.endsWith(".png")
                                || filePath.endsWith(".gif")) {
                            label.setIcon(new ImageIcon(filePath));
                            label.setText(""); // ลบข้อความออก
                        } else {
                            label.setText("File is not an image");
                        }
                    } else {
                        dtde.rejectDrop();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageDropDemo frame = new ImageDropDemo();
            frame.setVisible(true);
        });
    }
}
