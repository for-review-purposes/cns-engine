package dom.institution.lab.cns.engine.sampling.factories;

import dom.institution.lab.cns.engine.Debug;
import dom.institution.lab.cns.engine.Simulation;
import dom.institution.lab.cns.engine.sampling.Sampler;
import dom.institution.lab.cns.engine.sampling.filesamplers.FileBasedTransactionSampler;
import dom.institution.lab.cns.engine.sampling.interfaces.AbstractTransactionSampler;
import dom.institution.lab.cns.engine.sampling.standardsamplers.StandardTransactionSampler;

/**
 * Factory class responsible for creating instances of {@linkplain AbstractTransactionSampler}
 * based on whether a file-based or random sampling strategy is required.
 * <p>
 * The factory encapsulates the logic for deciding between a 
 * {@linkplain FileBasedTransactionSampler file-based sampler} and a 
 * {@linkplain StandardTransactionSampler standard sampler}, depending 
 * on whether a valid file path is provided.
 * </p>
 * 
 * <p>Usage example:</p>
 * <pre>{@code
 * TransactionSamplerFactory factory = new TransactionSamplerFactory();
 * AbstractTransactionSampler sampler = factory.getSampler(
 *         "transactions.csv", 
 *         outerSampler, 
 *         simulation);
 * }</pre>
 * 
 * @see AbstractTransactionSampler
 * @see FileBasedTransactionSampler
 * @see StandardTransactionSampler
 */
public class TransactionSamplerFactory {
	
	
    /**
     * Creates an {@linkplain AbstractTransactionSampler} instance according to the provided parameters.
     * <ul>
     *   <li>If a non-null {@code path} is supplied, a {@linkplain FileBasedTransactionSampler} is created.</li>
     *   <li>Otherwise, a {@linkplain StandardTransactionSampler} is created to perform random sampling.</li>
     * </ul>
     *
     * @param path the path to the transaction file; if {@code null}, random sampling will be used
     * @param outerSampler the outer {@linkplain Sampler sampler} that contains the sampler being created. In a typical set-up, the outer sampler is a {@linkplain FileBasedTransactionSampler} which delegates to an inner (the one being created here) generative sampler. 
     * @param sim the current {@linkplain Simulation simulation} context, used to obtain the simulation ID
     * @return an initialized {@linkplain AbstractTransactionSampler} ready for use in the simulation
     * @throws Exception if any error occurs while instantiating the sampler
     */
	public AbstractTransactionSampler getSampler(String path, 
			Sampler outerSampler, Simulation sim) throws Exception {

		if (path != null) {
			Debug.p("    Creating file-based workload sampler");
			return(new FileBasedTransactionSampler(path, new StandardTransactionSampler(outerSampler, sim.getSimID())));
		} else {
			Debug.p("    Creating random workload sampler");
				return(new StandardTransactionSampler(outerSampler, sim.getSimID()));
		}
	}
}
