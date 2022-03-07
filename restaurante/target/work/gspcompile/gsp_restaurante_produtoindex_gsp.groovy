import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_restaurante_produtoindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produto/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
invokeTag('javascript','g',7,['library':("jquery")],-1)
printHtmlPart(4)
invokeTag('remoteFunction','g',11,['controller':("produto"),'action':("lista"),'update':("divLista")],-1)
printHtmlPart(5)
invokeTag('remoteFunction','g',16,['controller':("produto"),'action':("excluir"),'update':("divLista"),'id':("'+id+'")],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('remoteLink','g',27,['controller':("produto"),'action':("adicionar"),'update':("divForm")],2)
printHtmlPart(9)
invokeTag('render','g',30,['template':("lista"),'model':([produtos: produtos])],-1)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',34,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1645819308725L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
