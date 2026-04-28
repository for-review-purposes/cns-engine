package dom.institution.lab.cns.engine.sampling.interfaces;
 /**
 * Interface for objects that can update their seed for random number generation.
 * 
 *
 */
public interface IMultiSowable {
	/**
	 * Update the seed for random number generation. Implementations should define how the seed is updated (e.g. based on a preset list of values).
	 */
	public void updateSeed();	
}