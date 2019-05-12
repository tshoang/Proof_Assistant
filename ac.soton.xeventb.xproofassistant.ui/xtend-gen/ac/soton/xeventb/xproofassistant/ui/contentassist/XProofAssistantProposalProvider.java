/**
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.ui.contentassist;

import ac.soton.xeventb.common.RodinSymbolsProposalProvider;
import ac.soton.xeventb.xproofassistant.ui.contentassist.AbstractXProofAssistantProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class XProofAssistantProposalProvider extends AbstractXProofAssistantProposalProvider {
  @Override
  public void complete_XFormula(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor);
  }
}