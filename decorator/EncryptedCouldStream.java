package decorator;

public class EncryptedCouldStream implements Stream {
  private Stream stream;

  public EncryptedCouldStream(Stream stream) {
    this.stream = stream;
  }

  @Override
  public void write(String data) {
    // encrypting data before writing
    var encrypted = encrypt(data);
    stream.write(encrypted);
  }

  private String encrypt(String data) {
    return "@#$(ù(mù(pé())é";
  }
}
