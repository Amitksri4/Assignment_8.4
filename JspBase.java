public abstract class JspFragmentBase
    implements javax.servlet.jsp.tagext.JspFragment
{
    protected javax.servlet.jsp.JspContext jspContext;
    protected javax.servlet.jsp.tagext.JspTag parentTag;
    public void JspFragmentBase(
        javax.servlet.jsp.JspContext jspContext,
        javax.servlet.jsp.tagext.JspTag parentTag )
    {
        this.jspContext = jspContext;
        this.parentTag = parentTag;
    }
}