package javaBasic;

//�������̽�: ���� ���谡 ���� ��ü���� ��ȣ �ۿ��� �ϱ� ���ؼ� ����ϴ� ��ġ�� �ý���
//�������̽� �����ϴ� ���
//�߻� �޼ҵ�� ����� ���� �� �� �ִ�.
//    public interface TV{
//        public int MAX_VOLUME = 100;
//        public int MIN_VOLUME = 0;
//
//        public void turnOn();
//        public void turnOff();
//        public void changeVolume(int volume);
//        public void changeChannel(int channel);
//    }
//�������̽����� ������ �����ϸ� �����Ͻ� �ڵ����� �Ʒ��� ���� �ٲ��.
//
//    public static final int MAX_VOLUME = 100;
//    public static final int MIN_VOLUME = 0;
//�������̽����� ���ǵ� �޼ҵ�� ��� �߻� �޼ҵ��̴�. ������ ����� ��� �޼ҵ�� ������ �ÿ� ������ ���� �ڵ����� ����ȴ�.
//
//    public abstract void on();
//    public abstract void off();
//    public abstract void volume(int value);
//    public abstract void channel(int number);



public interface TV {
	public int MIN_VOLUMN = 0;
	public int MAX_VOLUMN = 100;
	
	public void trunOn();
	public void trunOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
