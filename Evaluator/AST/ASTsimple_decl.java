/* Generated By:JJTree: Do not edit this line. ASTsimple_decl.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTsimple_decl extends SimpleNode {
  public ASTsimple_decl(int id) {
    super(id);
  }

  public ASTsimple_decl(HL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HLVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=fe848169078f412353d64dff46129ff5 (do not edit this line) */