import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_restaurante_controlePermissao_listaPermissoes_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/controlePermissao/_listaPermissoes.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( permissao in (permissoes) ) {
printHtmlPart(1)
expressionOut.print(permissao.authority)
printHtmlPart(2)
expressionOut.print(permissao.id)
printHtmlPart(3)
expressionOut.print(permissao.id)
printHtmlPart(4)
expressionOut.print(permissao.id)
printHtmlPart(5)
}
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1646656541963L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
