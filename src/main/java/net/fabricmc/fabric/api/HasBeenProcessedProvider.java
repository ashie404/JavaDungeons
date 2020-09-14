package net.fabricmc.fabric.api;

// Best interface name ever
public interface HasBeenProcessedProvider {
	boolean hasBeenProcessed();

	void setProcessed();
}