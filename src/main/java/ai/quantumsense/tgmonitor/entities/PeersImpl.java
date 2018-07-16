package ai.quantumsense.tgmonitor.entities;

import ai.quantumsense.tgmonitor.servicelocator.ServiceLocator;

import java.util.LinkedHashSet;
import java.util.Set;

public class PeersImpl implements Peers {

    private Set<String> peers = new LinkedHashSet<>();

    public PeersImpl(ServiceLocator<Peers> peersLocator) {
        peersLocator.registerService(this);
    }

    @Override
    public Set<String> getPeers() {
        return new LinkedHashSet<>(peers);
    }

    @Override
    public void setPeers(Set<String> peers) {
        this.peers = new LinkedHashSet<>(peers);
    }

    @Override
    public void addPeer(String peer) {
        this.peers.add(peer);
    }

    @Override
    public void addPeers(Set<String> peers) {
        this.peers.addAll(peers);
    }

    @Override
    public void removePeer(String peer) {
        this.peers.remove(peer);
    }

    @Override
    public void removePeers(Set<String> peers) {
        this.peers.removeAll(peers);
    }
}
