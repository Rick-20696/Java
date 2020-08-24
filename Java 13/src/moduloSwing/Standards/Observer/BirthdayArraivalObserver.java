package moduloSwing.Standards.Observer;

@FunctionalInterface
public interface BirthdayArraivalObserver {
	public void arrived (BirthdayArrivalEvent event);
}
