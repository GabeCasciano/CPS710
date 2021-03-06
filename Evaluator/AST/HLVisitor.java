/* Generated By:JavaCC: Do not edit this line. HLVisitor.java Version 5.0 */
public interface HLVisitor
{
  public Object visit(SimpleNode node, Object data) throws Exception;
  public Object visit(ASTbody node, Object data) throws Exception;
  public Object visit(ASTclause node, Object data) throws Exception;
  public Object visit(ASTsimple_decl node, Object data) throws Exception;
  public Object visit(ASTident_list node, Object data) throws Exception;
  public Object visit(ASTfn_decl node, Object data) throws Exception;
  public Object visit(ASTsub_decl node, Object data) throws Exception;
  public Object visit(ASTpredicate_decl node, Object data) throws Exception;
  public Object visit(ASTNUMTYPE node, Object data) throws Exception;
  public Object visit(ASTSTRTYPE node, Object data) throws Exception;
  public Object visit(ASTSETTYPE node, Object data) throws Exception;
  public Object visit(ASTOBJTYPE node, Object data) throws Exception;
  public Object visit(ASTparam_decls node, Object data) throws Exception;
  public Object visit(ASTparam_decl node, Object data) throws Exception;
  public Object visit(ASTassignment node, Object data) throws Exception;
  public Object visit(ASTif_stat node, Object data) throws Exception;
  public Object visit(ASTNOTHING node, Object data) throws Exception;
  public Object visit(ASTfor_explicit node, Object data) throws Exception;
  public Object visit(ASTfor_implicit node, Object data) throws Exception;
  public Object visit(ASTwhile_stat node, Object data) throws Exception;
  public Object visit(ASTfn_call node, Object data) throws Exception;
  public Object visit(ASTreturn_stat node, Object data) throws Exception;
  public Object visit(ASTTRUE node, Object data) throws Exception;
  public Object visit(ASTFALSE node, Object data) throws Exception;
  public Object visit(ASTprint node, Object data) throws Exception;
  public Object visit(ASTprintln node, Object data) throws Exception;
  public Object visit(ASTparameters node, Object data) throws Exception;
  public Object visit(ASTor node, Object data) throws Exception;
  public Object visit(ASTand node, Object data) throws Exception;
  public Object visit(ASTnot node, Object data) throws Exception;
  public Object visit(ASTcomparison node, Object data) throws Exception;
  public Object visit(ASTLESS node, Object data) throws Exception;
  public Object visit(ASTLESSEQ node, Object data) throws Exception;
  public Object visit(ASTGREATER node, Object data) throws Exception;
  public Object visit(ASTGREATEQ node, Object data) throws Exception;
  public Object visit(ASTNOTCOMP node, Object data) throws Exception;
  public Object visit(ASTEQUAL node, Object data) throws Exception;
  public Object visit(ASTNOTEQ node, Object data) throws Exception;
  public Object visit(ASTISIN node, Object data) throws Exception;
  public Object visit(ASTNOTIN node, Object data) throws Exception;
  public Object visit(ASTisatype node, Object data) throws Exception;
  public Object visit(ASTnegate node, Object data) throws Exception;
  public Object visit(ASTsum node, Object data) throws Exception;
  public Object visit(ASTdifference node, Object data) throws Exception;
  public Object visit(ASTproduct node, Object data) throws Exception;
  public Object visit(ASTquotient node, Object data) throws Exception;
  public Object visit(ASTremainder node, Object data) throws Exception;
  public Object visit(ASTNULL node, Object data) throws Exception;
  public Object visit(ASTset node, Object data) throws Exception;
  public Object visit(ASTidentifier node, Object data) throws Exception;
  public Object visit(ASTnumber node, Object data) throws Exception;
  public Object visit(ASTstring node, Object data) throws Exception;
}
/* JavaCC - OriginalChecksum=6c2d1528cfaaf533605e68cd2f74b58b (do not edit this line) */
