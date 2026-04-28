package dom.institution.lab.cns.engine;

/**
 * Interface for ledger structure, e.g. a blockchain or a DAG.
 *  
 */
public interface IStructure {
	/**
	 * Print the structure for human-readable presentation as a string. 
	 * @return An array of string presenting the structure. 
	 */
	String[] printStructure();
	
	
	/**
	 * Checks the degree to which a transaction is believed to be true.
	 * @param txID The ID of the transaction.
	 * @return the degree of belief in the transaction 
	 */
	float transactionBelief(long txID);
}
