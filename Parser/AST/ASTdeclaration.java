/* Generated By:JJTree: Do not edit this line. ASTdeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTdeclaration extends SimpleNode {
  public ASTdeclaration(int id) {
    super(id);
  }

  public ASTdeclaration(HL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HLVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d5b62a8cafbcf2f088d1030a0f5afb92 (do not edit this line) */
