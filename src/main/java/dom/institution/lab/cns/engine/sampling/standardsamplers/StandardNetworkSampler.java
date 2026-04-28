package dom.institution.lab.cns.engine.sampling.standardsamplers;

import dom.institution.lab.cns.engine.sampling.Sampler;
import dom.institution.lab.cns.engine.sampling.interfaces.AbstractNetworkSampler;

public class StandardNetworkSampler extends AbstractNetworkSampler {

    public StandardNetworkSampler(Sampler s) {
    	this.sampler = s;
    }
	
	
    /**
     * See parent. Use Normal distribution.
     */
    @Override
    public float getNextConnectionThroughput() {
        return (sampler.getGaussian(netThroughputMean, netThroughputSD, random));
    }


}
