//word转换为PDF<br />
<strong>PDFConverter wordConverter = new PDF2WordConverter();<br />
wordConverter.convert(new File(&quot;/x/111.docx&quot;), new File(&quot;/x/111.pdf&quot;));</strong><br />
<br />
//excel转换为PDF<br />
<strong>PDFConverter excelConverter = new PDF2ExcelConverter();<br />
excelConverter.convert(new File(&quot;/x/222.xlsx&quot;), new File(&quot;/x/222.pdf&quot;));</strong><br />
<br />
//ppt转换为PDF<br />
<strong>PDFConverter pptConverter = new PDF2PPTConverter();<br />
pptConverter.convert(new File(&quot;/x/333.pptx&quot;), new File(&quot;/x/333.pdf&quot;)); </strong>

<h1>项目依赖的jar请到<a href="https://download.csdn.net/download/w757227129/10681394">https://download.csdn.net/download/w757227129/10681394</a>下载</h1>
