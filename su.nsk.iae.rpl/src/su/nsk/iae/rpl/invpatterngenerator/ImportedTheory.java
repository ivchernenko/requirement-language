package su.nsk.iae.rpl.invpatterngenerator;

public class ImportedTheory {
	String session;
	String theoryName;
	public ImportedTheory(String session, String theoryName) {
		super();
		this.session = session;
		this.theoryName = theoryName;
	}
	
	@Override
	public String toString() {
		if (session == null)
			return theoryName;
		return session + '.' + theoryName;
	}

}
