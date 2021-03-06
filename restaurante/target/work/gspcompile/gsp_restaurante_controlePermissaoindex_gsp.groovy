import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_restaurante_controlePermissaoindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/controlePermissao/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',164,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('formRemote','g',173,['id':("formUsuario"),'name':("formUsuario"),'url':([controller: 'controlePermissao', action: 'salvarUsuario']),'onSuccess':("retornoSalvarUsuario(data)")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('formRemote','g',187,['id':("formPermissao"),'name':("formPermissao"),'url':([controller: 'controlePermissao', action: 'salvarPermissao']),'onSuccess':("retornoSalvarPermissao(data)")],2)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',192,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1646658870566L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
