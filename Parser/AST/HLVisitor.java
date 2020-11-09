/* Generated By:JavaCC: Do not edit this line. HLVisitor.java Version 5.0 */
public interface HLVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTassignment node, Object data);
  public Object visit(ASTexpression node, Object data);
  public Object visit(ASTstatement node, Object data);
  public Object visit(ASTstatement_ll node, Object data);
  public Object visit(ASTfn_call node, Object data);
  public Object visit(ASTdeclaration node, Object data);
  public Object visit(ASTbody node, Object data);
  public Object visit(ASTclause node, Object data);
  public Object visit(ASTsimple_decl node, Object data);
  public Object visit(ASTfn_decl node, Object data);
  public Object visit(ASTsub_decl node, Object data);
  public Object visit(ASTpredicate_decl node, Object data);
  public Object visit(ASTtype node, Object data);
  public Object visit(ASTident_list node, Object data);
  public Object visit(ASTparam_decls node, Object data);
  public Object visit(ASTparam_decl node, Object data);
  public Object visit(ASTif_stat node, Object data);
  public Object visit(ASTfor_explicit node, Object data);
  public Object visit(ASTfor_implicit node, Object data);
  public Object visit(ASTwhile_stat node, Object data);
  public Object visit(ASTreturn_stat node, Object data);
  public Object visit(ASTprint_stat node, Object data);
  public Object visit(ASTprintln_stat node, Object data);
  public Object visit(ASTparameters node, Object data);
  public Object visit(ASTisatype node, Object data);
  public Object visit(ASTsumation node, Object data);
  public Object visit(ASTsubtraction node, Object data);
  public Object visit(ASTproduct node, Object data);
  public Object visit(ASTdivision node, Object data);
  public Object visit(ASTmodulo node, Object data);
  public Object visit(ASTset node, Object data);
  public Object visit(ASTIdentifier node, Object data);
  public Object visit(ASTNumber node, Object data);
  public Object visit(ASTString node, Object data);
  public Object visit(ASTTrue node, Object data);
  public Object visit(ASTFalse node, Object data);
  public Object visit(ASTNumType node, Object data);
  public Object visit(ASTStrType node, Object data);
  public Object visit(ASTSetType node, Object data);
  public Object visit(ASTObjType node, Object data);
  public Object visit(ASTLess node, Object data);
  public Object visit(ASTLessEq node, Object data);
  public Object visit(ASTGreater node, Object data);
  public Object visit(ASTGreateEq node, Object data);
  public Object visit(ASTNotComp node, Object data);
  public Object visit(ASTNotEq node, Object data);
  public Object visit(ASTEqual node, Object data);
  public Object visit(ASTIsIn node, Object data);
  public Object visit(ASTIsNotIn node, Object data);
  public Object visit(ASTPlusOp node, Object data);
}
/* JavaCC - OriginalChecksum=1f66e6b793095b7b39fd9ffcd82e8afd (do not edit this line) */
