package docker;

/**
 * <h1>https://docs.docker.com/get-started/part3/#about-services!</h1> In a
 * distributed application, different pieces of the app are called services.
 * <br>
 * For example, if you imagine a video sharing site, it probably includes a
 * service for <br>
 * storing application data in a database, a service for video transcoding in
 * the background <br>
 * after a user uploads something, a service for the front-end, and so on.<br>
 * <br>
 * Services are really just containers in production. <br>
 * A service only runs one image, but it codifies the way that image runs what
 * ports it should use, <br>
 * how many replicas of the container should run so the service has the capacity
 * it needs, and so on. <br>
 * Scaling a service changes the number of container instances running that
 * piece of software,<br>
 * assigning more computing resources to the service in the process.<br>
 * <br>
 * Luckily it's very easy to define, run, and scale services with the Docker<br>
 * platform just write a docker-compose.yml file.<br>
 * <p>
 * Common command Docker
 * </p>
 *
 * @author Hai Thai
 * @version 1.0
 * @since 2014-03-31
 */
public class ServiceCommand {
	/**
	 * <h3>Run, and scale services with the Docker platform</h3>
	 * <h4>Your first docker-compose.yml file</h4>
	 * <img src="../public-files/service-1.png" alt="Setting Docker Compose"> <br>
	 * <p>
	 * This <code class="highlighter-rouge">docker-compose.yml</code> file tells
	 * Docker to do the following:
	 * </p>
	 * <ul>
	 * <li>
	 * <p>
	 * Pull <a href="https://docs.docker.com/get-started/part2/">the image we
	 * uploaded in step 2</a> from the registry.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * Run 5 instances of that image as a service called
	 * <code class="highlighter-rouge">web</code>, limiting each one to use, at
	 * most, 10% of the CPU (across all cores), and 50MB of RAM.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * Immediately restart containers if one fails.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * Map port 80 on the host to <code class="highlighter-rouge">web</code>’s port
	 * 80.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * Instruct <code class="highlighter-rouge">web</code>’s containers to share
	 * port 80 via a load-balanced network called
	 * <code class="highlighter-rouge">webnet</code>. (Internally, the containers
	 * themselves publish to <code class="highlighter-rouge">web</code>’s port 80 at
	 * an ephemeral port.)
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * Define the <code class="highlighter-rouge">webnet</code> network with the
	 * default settings (which is a load-balanced overlay network).
	 * </p>
	 * </li>
	 * </ul>
	 * <h2 id="run-your-new-load-balanced-app">Run your new load-balanced app</h2>
	 * <p>
	 * Before we can use the
	 * <code class="highlighter-rouge">docker stack deploy</code> command we first
	 * run:
	 * </p>
	 * <code>docker swarm init</code>
	 * <p>
	 * Now let’s run it. You need to give your app a name. Here, it is set to
	 * <code class="highlighter-rouge">getstartedlab</code>:
	 * </p>
	 * <div class="language-shell highlighter-rouge"><div class="highlight">
	 * 
	 * <pre class="highlight">
	 * <code>docker stack deploy <span class=
	 * "nt">-c</span> docker-compose.yml getstartedlab</code>
	 * </pre>
	 * 
	 * </div></div>
	 * <p>
	 * Our single service stack is running 5 container instances of our deployed
	 * image on one host. Let’s investigate.
	 * </p>
	 * <p>
	 * Get the service ID for the one service in our application:
	 * </p>
	 * 
	 * <div class="highlight">
	 * 
	 * <pre class="highlight">
	 * <code>docker service <span class="nb">ls</span></code>
	 * </pre>
	 * 
	 * </div>
	 * <p>
	 * Look for output for the <code class="highlighter-rouge">web</code> service,
	 * prepended with your app name. If you named it the same as shown in this
	 * example, the name is
	 * <code class="highlighter-rouge">getstartedlab_web</code>. The service ID is
	 * listed as well, along with the number of replicas, image name, and exposed
	 * ports.
	 * </p>
	 * 
	 * <p>
	 * A single container running in a service is called a <strong>task</strong>.
	 * Tasks are given unique IDs that numerically increment, up to the number of
	 * <code class="highlighter-rouge">replicas</code> you defined in
	 * <code class="highlighter-rouge">docker-compose.yml</code>. List the tasks for
	 * your service:
	 * </p>
	 *
	 *
	 *
	 * <div class="language-shell highlighter-rouge"><div class="highlight">
	 * 
	 * <pre class="highlight">
	 * <code>docker service ps getstartedlab_web
	</code>
	 * </pre>
	 * 
	 * </div></div>
	 * <p>
	 * Tasks also show up if you just list all the containers on your system, though
	 * that is not filtered by service:
	 * </p>
	 * 
	 * <div class="language-shell highlighter-rouge"><div class="highlight">
	 * 
	 * <pre class="highlight">
	 * <code>docker container <span class="nb">ls</span> <span class=
	"nt">-q</span>	</code>
	 * </pre>
	 * 
	 * </div></div>
	 *
	 * <p>
	 * You can run <code class="highlighter-rouge">curl -4 http://localhost</code>
	 * several times in a row, or go to that URL in your browser and hit refresh a
	 * few times.
	 * </p>
	 *
	 *
	 * <p>
	 * <img src="../public-files/service-2.png" alt="Hello World in browser">
	 * </p>
	 *
	 * <h2 id="scale-the-app">Scale the app</h2>
	 * <p>
	 * <img src="../public-files/service-3.png" alt="Scale">
	 * </p>
	 *
	 */
	public String Run_Scale_Service_With_The_Docker_Platform;

	/**
	 * Detail - Common Command <div class="highlight">
	 * 
	 * <pre class="highlight">
	 * <code>docker stack <span class=
	 * "nb">ls</span>                                            <span class=
	 * "c"># List stacks or apps</span>
	docker stack deploy <span class=
	"nt">-c</span> &lt;composefile&gt; &lt;appname&gt;  <span class=
	"c"># Run the specified Compose file</span>
	docker service <span class="nb">ls</span>                 <span class=
	"c"># List running services associated with an app</span>
	docker service ps &lt;service&gt;                  <span class=
	"c"># List tasks associated with an app</span>
	docker inspect &lt;task or container&gt;                   <span class=
	"c"># Inspect task or container</span>
	docker container <span class="nb">ls</span> <span class=
	"nt">-q</span>                                      <span class=
	"c"># List container IDs</span>
	docker stack rm &lt;appname&gt;                             <span class=
	"c"># Tear down an application</span>
	docker swarm leave <span class="nt">--force</span>      <span class=
	"c"># Take down a single node swarm from the manager</span>
	</code>
	 * </pre>
	 * 
	 * </div>
	 */
	public String Common_Command_Service_Docker;
}
