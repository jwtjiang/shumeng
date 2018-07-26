package com.example.demo.controller;

import com.example.demo.po.evaluationModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jwt on 2018/7/25.
 * 导出pdf类
 */
@RestController
public class exportPdfCon {
    @RequestMapping("/downloadPdf")
    public void downloadPdf(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 告诉浏览器用什么软件可以打开此文件
        response.setHeader("content-Type", "application/pdf");
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename=user.pdf");

        Document document = new Document();
        PdfWriter.getInstance(document, response.getOutputStream());
        document.open();
        List<evaluationModel> list = new ArrayList<evaluationModel>();
        for (int i=1;i<4;i++){
            evaluationModel student = new evaluationModel();
            student.setEmId(i);
        }
        PdfPTable table1 = new PdfPTable(2);
        PdfPCell cell1 = new PdfPCell();
        for (evaluationModel studnet : list) {
            evaluationModel student = new evaluationModel();
            PdfPTable table = new PdfPTable(2);
            PdfPCell cell = new PdfPCell();
            cell.setPhrase(new Paragraph(student.getEmId()+""));
            table.addCell(cell);
            document.add(table);

            cell = new PdfPCell();
            cell.setPhrase(new Paragraph(student.getEmId().toString()));
            table.addCell(cell);
            document.add(table);
        }
        document.close();
    }
}
