/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.ide.contentassist.antlr;

import ac.soton.xeventb.ide.contentassist.antlr.internal.InternalProofAssistantParser;
import ac.soton.xeventb.services.ProofAssistantGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ProofAssistantParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ProofAssistantGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ProofAssistantGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getProofAssistantAccess().getGroup(), "rule__ProofAssistant__Group__0");
			builder.put(grammarAccess.getProofAssistantAccess().getGroup_4(), "rule__ProofAssistant__Group_4__0");
			builder.put(grammarAccess.getSelectionHintAccess().getGroup(), "rule__SelectionHint__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getProofAssistantAccess().getNameAssignment_1(), "rule__ProofAssistant__NameAssignment_1");
			builder.put(grammarAccess.getProofAssistantAccess().getComponentAssignment_3(), "rule__ProofAssistant__ComponentAssignment_3");
			builder.put(grammarAccess.getProofAssistantAccess().getHintsAssignment_4_1(), "rule__ProofAssistant__HintsAssignment_4_1");
			builder.put(grammarAccess.getSelectionHintAccess().getElementAssignment_1(), "rule__SelectionHint__ElementAssignment_1");
			builder.put(grammarAccess.getSelectionHintAccess().getSelectionsAssignment_3(), "rule__SelectionHint__SelectionsAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ProofAssistantGrammarAccess grammarAccess;

	@Override
	protected InternalProofAssistantParser createParser() {
		InternalProofAssistantParser result = new InternalProofAssistantParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ProofAssistantGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProofAssistantGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
