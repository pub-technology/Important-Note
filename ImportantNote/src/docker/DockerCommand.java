package docker;
/**
* <h1>Docker!</h1>
* Docker is a platform for developers and sysadmins <br>
* to develop, deploy, and run applications with containers.<br>
* The use of Linux containers to deploy applications is called containerization.<br>
* Containers are not new, but their use for easily deploying applications is.<br>
* <p> Common command Docker </p>
*
* @author  Hai Thai
* @version 1.0
* @since   2014-03-31
*/
public class DockerCommand {
	/**
	 * <h3>$ docker --version</h3>
	 * <h4>Ensure that you have a supported version of Docker</h4>
	 * Docker version 17.12.0-ce, build c97c6d6<br>
	 */
	public String Docker_Version;
	
	/**
	 * <h3>$ docker info</h3>
	 * <h4>Note: To avoid permission errors (and the use of sudo), add your user to the docker group. </h4>
	 * <img src="../index-files/dockerinfo.png" alt="docker info">
	 */
	public String View_Doker_Info;
	
	
	/**
	 * <h3>$ docker run hello-world</h3>
	 * <h4>Excecute Docker image</h4>
	 */
	public String Excecute_Docker_Image;
	
	
	/**
	 * <h3>$ docker image ls</h3>
	 * <h4>List Docker images</h4>
	 */
	public String List_Docker_Images;
	
	/**
	 * <h3>$ docker container ls</h3>
	 * <h3>$ docker container ls -all</h3>
	 * <h3>$ docker container ls -a -q</h3>
	 * <h4>List Docker containers (running, all, all in quiet mode)</h4>
	 */
	public String List_Docker_Containers__Running_all_And_all_in_quiet_mode__;
}
