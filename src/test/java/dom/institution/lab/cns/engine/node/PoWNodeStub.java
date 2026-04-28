package dom.institution.lab.cns.engine.node;

import dom.institution.lab.cns.engine.IStructure;
import dom.institution.lab.cns.engine.Simulation;
import dom.institution.lab.cns.engine.node.INode;
import dom.institution.lab.cns.engine.node.PoWNode;
import dom.institution.lab.cns.engine.transaction.ITxContainer;
import dom.institution.lab.cns.engine.transaction.Transaction;

public class PoWNodeStub extends PoWNode {

    public PoWNodeStub(Simulation sim) {
        super(sim);
    }

    @Override
    public IStructure getStructure() {
        return null;
    }

    @Override
    public void timeAdvancementReport() {

    }

    @Override
    public void periodicReport() {

    }

    @Override
    public void close(INode n) {

    }

    @Override
    public void event_NodeReceivesClientTransaction(Transaction t, long time) {

    }

    @Override
    public void event_NodeReceivesPropagatedContainer(ITxContainer t) {

    }

    
	@Override
	public void beliefReport(long[] sample, long time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nodeStatusReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void structureReport() {
		// TODO Auto-generated method stub
		
	}
}
