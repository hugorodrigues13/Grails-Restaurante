import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_restaurante_produto_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produto/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(produto.nome)
printHtmlPart(2)
expressionOut.print(produto.preco)
printHtmlPart(3)
expressionOut.print(produto.estoque?.quantidade)
printHtmlPart(4)
expressionOut.print(produto.estoque?.quantidadeMinima)
printHtmlPart(5)
expressionOut.print(produto.id)
printHtmlPart(6)
})
invokeTag('formRemote','g',12,['name':("frmProduto"),'url':([controller: 'produto', action: 'salvar']),'update':("divMensagem"),'onSuccess':("carregarLista()")],1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1645819188491L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
