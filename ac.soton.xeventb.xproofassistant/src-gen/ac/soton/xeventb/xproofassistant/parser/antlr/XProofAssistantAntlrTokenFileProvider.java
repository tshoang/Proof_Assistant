/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XProofAssistantAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ac/soton/xeventb/xproofassistant/parser/antlr/internal/InternalXProofAssistant.tokens");
	}
}