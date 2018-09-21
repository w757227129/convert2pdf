package com.sbr.converter.demo;

import java.io.File;

import com.sbr.converter.PDFConverter;
import com.sbr.converter.components.impl.PDF2ExcelConverter;
import com.sbr.converter.components.impl.PDF2PPTConverter;
import com.sbr.converter.components.impl.PDF2WordConverter;

public class Demo {
	public static void main(String[] args) {
		
		//word转换为PDF
		PDFConverter wordConverter = new PDF2WordConverter();
		wordConverter.convert(new File("/Users/caomei/Desktop/111.docx"), new File("/Users/caomei/Desktop/111.pdf"));
		
		//excel转换为PDF
		PDFConverter excelConverter = new PDF2ExcelConverter();
		excelConverter.convert(new File("/Users/caomei/Desktop/222.xlsx"), new File("/Users/caomei/Desktop/222.pdf"));
		
		//ppt转换为PDF
		PDFConverter pptConverter = new PDF2PPTConverter();
		pptConverter.convert(new File("/Users/caomei/Desktop/333.pptx"), new File("/Users/caomei/Desktop/333.pdf"));
	}
}
