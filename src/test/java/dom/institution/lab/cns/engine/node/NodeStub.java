package dom.institution.lab.cns.engine.node;

import dom.institution.lab.cns.engine.IStructure;
import dom.institution.lab.cns.engine.Simulation;
import dom.institution.lab.cns.engine.node.INode;
import dom.institution.lab.cns.engine.node.Node;
import dom.institution.lab.cns.engine.transaction.ITxContainer;
import dom.institution.lab.cns.engine.transaction.Transaction;

public class NodeStub extends Node {

	private String behavior;
	private float hashPower;

	public NodeStub(Simulation sim) {
		super(sim);
		// TODO Auto-generated constructor stub
	}

	public NodeStub() {
		super();
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getBehavior() {
		return this.behavior;
	}

	public void setHashPower(float hashPower) {
		this.hashPower = hashPower;
	}

	public float getHashPower() {
		return this.hashPower;
	}

	
	
	@Override
	public IStructure getStructure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void timeAdvancementReport() {
		// TODO Auto-generated method stub

	}

	@Override
	public void periodicReport() {
		// TODO Auto-generated method stub

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

	@Override
	public void close(INode n) {
		// TODO Auto-generated method stub

	}

	@Override
	public void event_NodeReceivesClientTransaction(Transaction t, long time) {
		// TODO Auto-generated method stub

	}

	@Override
	public void event_NodeReceivesPropagatedContainer(ITxContainer t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void event_NodeCompletesValidation(ITxContainer t, long time) {
		// TODO Auto-generated method stub

	}

	@Override
	public void event_NodeReceivesPropagatedTransaction(Transaction t, long time) {
		// TODO Auto-generated method stub

	}

}
