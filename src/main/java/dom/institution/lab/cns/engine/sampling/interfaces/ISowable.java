package dom.institution.lab.cns.engine.sampling.interfaces;

/**
 * Interface for objects that can be sown with a seed for random number generation.
 * 
 *
 */
public interface ISowable {
	/**
	 * Set the seed for random number generation.
	 * 
	 * @param seed The seed value.
	 */
	void setSeed(long seed);
}