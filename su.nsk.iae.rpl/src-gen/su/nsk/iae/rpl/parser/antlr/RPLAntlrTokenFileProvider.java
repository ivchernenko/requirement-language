/*
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RPLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("su/nsk/iae/rpl/parser/antlr/internal/InternalRPL.tokens");
	}
}
