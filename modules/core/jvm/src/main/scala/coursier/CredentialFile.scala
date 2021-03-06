/**
  * This code USED TO BE generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
  */

// DO EDIT MANUALLY from now on
package coursier
final class CredentialFile private (
  val path: String,
  val optional: Boolean) extends coursier.internal.CredentialFileHelpers with Serializable {
  
  private def this(path: String) = this(path, true)
  
  override def equals(o: Any): Boolean = o match {
    case x: CredentialFile => (this.path == x.path) && (this.optional == x.optional)
    case _ => false
  }
  override def hashCode: Int = {
    37 * (37 * (37 * (17 + "coursier.CredentialFile".##) + path.##) + optional.##)
  }
  override def toString: String = {
    "CredentialFile(" + path + ", " + optional + ")"
  }
  private[this] def copy(path: String = path, optional: Boolean = optional): CredentialFile = {
    new CredentialFile(path, optional)
  }
  def withPath(path: String): CredentialFile = {
    copy(path = path)
  }
  def withOptional(optional: Boolean): CredentialFile = {
    copy(optional = optional)
  }
}
object CredentialFile {
  
  def apply(path: String): CredentialFile = new CredentialFile(path)
  def apply(path: String, optional: Boolean): CredentialFile = new CredentialFile(path, optional)
}
