/* Generated By:JavaCC: Do not edit this line. HLVisitor.java Version 5.0 */
import java.math.BigInteger;
import java.util.Arrays;

import AST.*;

public class HLEval implements HLVisitor
{
  public Object visit(SimpleNode node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTbody node, Object data) throws Exception
		{
			System.out.println("body");
		return null;
		}

  public Object visit(ASTclause node, Object data) throws Exception
		{
			node.jjtGetChild(0).jjtAccept(this, data);
			return null;
		}

  public Object visit(ASTsimple_decl node, Object data) throws Exception
		{
			System.out.println("simple dec");
		return null;
		}

  public Object visit(ASTident_list node, Object data) throws Exception
		{
			System.out.println("ident list");
		return null;
		}

  public Object visit(ASTfn_decl node, Object data) throws Exception
		{
			System.out.println("fn decls");
		return null;
		}

  public Object visit(ASTsub_decl node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTpredicate_decl node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTNUMTYPE node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTSTRTYPE node, Object data) throws Exception
		{

		return null;
		}

  public Object visit(ASTSETTYPE node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTOBJTYPE node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTparam_decls node, Object data) throws Exception
		{
			System.out.println("param_decels");
		return null;
		}

  public Object visit(ASTparam_decl node, Object data) throws Exception
		{
			System.out.println("param_decel");
		return null;
		}

  public Object visit(ASTassignment node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTif_stat node, Object data) throws Exception
		{		
			node.jjtGetChild(0).jjtGetChild(1).jjtAddChild(node.jjtGetChild(0).jjtGetChild(0), 0);
			node.jjtGetChild(0).jjtGetChild(1).jjtAddChild(node.jjtGetChild(0).jjtGetChild(2), 0);
			
			node.jjtGetChild(0).jjtGetChild(1).jjtAccept(this, data);
			
		return null;
		}

  public Object visit(ASTNOTHING node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTfor_explicit node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTfor_implicit node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTwhile_stat node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTfn_call node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTreturn_stat node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTTRUE node, Object data) throws Exception
		{
		return true;
		}

  public Object visit(ASTFALSE node, Object data) throws Exception
		{
		return false;
		}

  public Object visit(ASTprint node, Object data) throws Exception
		{
		System.out.print(node.jjtGetChild(0).jjtAccept(this, data));
		return null;
		}

  public Object visit(ASTprintln node, Object data) throws Exception
		{
		System.out.println(node.jjtGetChild(0).jjtAccept(this, data));
		return null;
		}

  public Object visit(ASTparameters node, Object data) throws Exception 
		{
			//subject to change later
		return node.jjtGetChild(0).jjtAccept(this, data);
		}

  public Object visit(ASTor node, Object data) throws Exception
		{
			boolean or = (Boolean) node.jjtGetChild(0).jjtAccept(this, data);
			
			return or | (Boolean) node.jjtGetChild(1).jjtAccept(this, data);
		}

  public Object visit(ASTand node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTnot node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTcomparison node, Object data) throws Exception
		{
		return node.jjtGetChild(0).jjtAccept(this, data);
		}

  public Object visit(ASTLESS node, Object data) throws Exception
		{

			System.out.println("Less");
			System.out.println(node.jjtGetNumChildren());

			return null;
			
		}

  public Object visit(ASTLESSEQ node, Object data) throws Exception
		{
			if(node.jjtGetChild(0).jjtAccept(this, data).getClass() == ASTnumber.class){
				int lhs = (Integer) node.jjtGetChild(0).jjtAccept(this, data);
				int rhs = (Integer) node.jjtGetChild(1).jjtAccept(this, data);

				if(lhs <= rhs)
					return true;
				return false;
			}
			else if(node.jjtGetChild(0).jjtAccept(this, data).getClass() == ASTset.class){
				//lhs is a subset of 
			}

		return null;
		}

  public Object visit(ASTGREATER node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTGREATEQ node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTNOTCOMP node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTEQUAL node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTNOTEQ node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTISIN node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTNOTIN node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTisatype node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTnegate node, Object data) throws Exception
		{
			return -1 * (Integer) node.jjtGetChild(0).jjtAccept(this, data);
		}

  public Object visit(ASTsum node, Object data) throws Exception
		{
			if(node.jjtGetChild(0).getClass() == ASTnumber.class)
			{
				int sum = 0;

				for(int i = 0; i < node.jjtGetNumChildren(); i++)
					sum += (Integer) node.jjtGetChild(i).jjtAccept(this, data);
		
				return sum;
			}
			else if(node.jjtGetChild(0).getClass() == ASTstring.class){
				String sum = "";

				for(int i = 0; i < node.jjtGetNumChildren(); i++)
					sum = sum + node.jjtGetChild(i).jjtAccept(this, data);

				return sum;
			}
			else if(node.jjtGetChild(0).getClass() == ASTset.class){
				// set union
			}
			return null;
		}

  public Object visit(ASTdifference node, Object data) throws Exception
		{
			if(node.jjtGetChild(0).getClass() == ASTnumber.class){

				int difference = (Integer) node.jjtGetChild(0).jjtAccept(this, data);
				
				return difference - (Integer) node.jjtGetChild(1).jjtAccept(this, data);
			}
			else if(node.jjtGetChild(0).getClass() == ASTset.class){
				//set difference
			}
			return null;

		}

  public Object visit(ASTproduct node, Object data) throws Exception
		{
			if(node.jjtGetChild(0).getClass() == ASTnumber.class){

				int product = 1;

				for(int i = 0; i < node.jjtGetNumChildren(); i++)
					product *= (Integer) node.jjtGetChild(i).jjtAccept(this, data);

				return product;
			}
			else if(node.jjtGetChild(0).getClass() == ASTset.class){
				//set intersection
			}
			return null;
			
		}

  public Object visit(ASTquotient node, Object data) throws Exception
		{
			int quotient = (Integer) node.jjtGetChild(0).jjtAccept(this, data);

			return quotient / (Integer) node.jjtGetChild(1).jjtAccept(this, data);
		}

  public Object visit(ASTremainder node, Object data) throws Exception
		{
			int mod = (Integer) node.jjtGetChild(0).jjtAccept(this, data);

			return mod % (Integer) node.jjtGetChild(1).jjtAccept(this, data);
		}

  public Object visit(ASTNULL node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTset node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTidentifier node, Object data) throws Exception
		{
		return null;
		}

  public Object visit(ASTnumber node, Object data) throws Exception
		{
		return node.jjtGetValue();
		}

  public Object visit(ASTstring node, Object data) throws Exception
		{
		return node.jjtGetValue();
		}

}
/* JavaCC - OriginalChecksum=6c2d1528cfaaf533605e68cd2f74b58b (do not edit this line) */