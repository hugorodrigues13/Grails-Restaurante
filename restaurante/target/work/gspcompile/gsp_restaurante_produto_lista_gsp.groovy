import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_restaurante_produto_lista_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produto/_lista.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
if(true && (produtos.size() > 0)) {
printHtmlPart(0)
for( produto in (produtos) ) {
printHtmlPart(1)
expressionOut.print(produto.nome)
printHtmlPart(2)
expressionOut.print(produto.preco)
printHtmlPart(2)
expressionOut.print(produto.estoque?.quantidade)
printHtmlPart(2)
expressionOut.print(produto.estoque?.quantidadeMinima)
printHtmlPart(3)
createClosureForHtmlPart(4, 3)
invokeTag('remoteLink','g',17,['controller':("produto"),'action':("alterar"),'update':("divForm"),'id':(produto.id)],3)
printHtmlPart(5)
expressionOut.print(produto.id)
printHtmlPart(6)
}
printHtmlPart(7)
}
else {
printHtmlPart(8)
}
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1645818010457L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
