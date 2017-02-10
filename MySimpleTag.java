public class MySimpleTag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
{
    // Attributes:
    private String x;
    private String y;
    private String nonfragment;
    private javax.servlet.jsp.tagext.JspFragment frag;
    // Setters and getters for attributes:
    public void setX( Stirng x ) {
        this.x = x; 
    }
    public String getX() {
        return this.x; 
    }
    public void setY( String y ) { 
        this.y = y; 
    }
    public String getY() { 
        return this.y; 
    }
    public void setNonfragment( String nonfragment ) {
        this.nonfragment = nonfragment; 
    }
    public String getNonfragment() {
        return this.nonfragment;
    }
    public void setFrag( javax.servlet.jsp.tagext.JspFragment frag ) {
        this.frag = frag;
    }
    public javax.servlet.jsp.tagext.JspFragment getFrag() {
        return this.frag;
    }

    protected JspContext jspContext;
    public void setJspContext( JspContext ctx ) {
        super.setJspContext( ctx );
        // Step T.2 - A JspContext wrapper is created.
        // (Implementation of wrapper not shown).
        this.jspContext = new utils.JspContextWrapper( ctx );
    }
    public JspContext getJspContext() {
        // Step T.2 - Calling getJspContext() must return the 
        // wrapped JspContext.
        return this.jspContext;
    }

    public void doTag() throws JspException {
        java.lang.Object jspValue;
        JspContext jspContext = getJspContext();
        JspContext _jsp_parentContext = 
            SimpleTagSupport.this.getJspContext();
        try {
            javax.servlet.jsp.JspWriter out = jspContext.getOut();

            // Create page-scope attributes for each tag attribute:
            this.jspContext.setAttribute( "x", getX() );
            this.jspContext.setAttribute( "y", getY() );
            this.jspContext.setAttribute( "nonfragment", getNonfragment() );
            this.jspContext.setAttribute( "frag", getFrag() );

            // Synchronize AT_BEGIN variables from calling page
            if( (jspValue = _jsp_parentContext.getAttribute( 
                    "var1" )) != null ) 
            {
                jspContext.setAttribute( "var1", value );
            }
            else {
                jspContext.removeAttribute( "var1", 
                    JspContext.PAGE_SCOPE );
            }

            // Tag template text:
            out.write( "\n\n\n\n\n\n\n\nSome template text.\n" );

            // Invoke c:set - recognized tag handler from JSTL:
            jspContext.setAttribute( "var1", 
                jspContext.getExpressionEvaluator().evaluate(
                    "${x+y}",
                    java.lang.String.class,
                    jspContext,
                    prefixMap, functionMap, "my" ) );

            // Invoke the "frag" fragment:
            // Step F.1 - Set values of AT_BEGIN and NESTED variables
            //     in calling page context.
            if( (jspValue = jspContext.getAttribute( "var1" )) != null ) {
                _jsp_parentContext.setAttribute( "var1", value );
            }
            else {
                _jsp_parentContext.removeAttribute( "var1", 
                    JspContext.PAGE_SCOPE );
            }

            // Step F.2 - varReader is specified, generate a writer.
            java.io.Writer _jsp_sout = new java.io.StringWriter();

            // Step F.3 - Invoke fragment with writer
            getFrag().invoke( _jsp_sout );

            // Step F.4 - F.6 occur in the fragment (see above)
            // Step F.7 - fragment returns

            // Step F.8 - varReader specified, so save to var
            jspContext.setAttribute(
                "var1", new StringReader( _jsp_sout.toString() ) );

            // Step F.9 - Done!


            out.write( "\n\nInvoke the body:\n" );

            // Invoke the body of the tag:
            // Step F.1 - Set values of AT_BEGIN and NESTED variables
            //     in calling page context.
            if( (jspValue = jspContext.getAttribute( "var1" )) != null ) {
                _jsp_parentContext.setAttribute( "var1", value );
            }
            else {
                _jsp_parentContext.removeAttribute( "var1", 
                    JspContext.PAGE_SCOPE);
            }

            // Step F.2 - varReader is not specified - does not apply.

            try {
                // Step F.3 - Invoke body, passing optional writer
                getJspBody().invoke( null );
            }
            finally {
                // Steps F.4 - F.6 occur in the fragment (see above)
                // Step F.7 - fragment returns
            }

            // Step F.8 does not apply.
            // Step F.9 - Done!
        }
        finally {
            // Tag handlers generate code to synchronize AT_BEGIN with
            // calling page, regardless of whether an error occurs.
            if( (jspValue = jspContext.getAttribute( "var1" )) != null ) {
                _jsp_parentContext.setAttribute( "var1", value );
            }
            else {
                _jsp_parentContext.removeAttribute( "var1", 
                    JspContext.PAGE_SCOPE );
            }
        }
    }
}