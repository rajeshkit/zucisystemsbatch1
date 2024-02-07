package zuci.oms.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail = request.getParameter("email");
		System.out.println(request.getParameter("password"));
		System.out.println(mail);
    	response.setContentType("text/html");
//    	response.getWriter().append("<!DOCTYPE html>\r\n"
//    			+ "<html lang=\"en\">\r\n"
//    			+ "    <head> <!-- meta data - browser /  search engine -->\r\n"
//    			+ "        <meta charset=\"UTF-8\">\r\n"
//    			+ "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
//    			+ "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
//    			+ "        <title>Document</title>\r\n"
//    			+ "        <!-- <link href=\"style.css\" rel=\"stylesheet\"> -->\r\n"
//    			+ "        \r\n"
//    			+ "        \r\n"
//    			+ "    </head>\r\n"
//    			+ "    <body>\r\n"
//    			+ "        Lorem <b>ipsum</b> dolor sit <p>amet consectetur</p> adipisicing elit. Suscipit possimus, animi saepe eaque eligendi repellendus consequatur delectus illum facere consectetur labore praesentium hic quibusdam atque. Dolor corrupti doloremque nobis qui.\r\n"
//    			+ "        <button onclick=\"paragraphClicked()\">ffggfg</button>    \r\n"
//    			+ "        <h1 align=\"center\">Zuci System chennai</h1>\r\n"
//    			+ "        <p class=\"content\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Consectetur accusamus consequuntur nam nemo ut culpa obcaecati at cumque quod itaque, possimus eligendi numquam eaque?\r\n"
//    			+ "             Blanditiis eveniet hic accusamus optio minus.</p>\r\n"
//    			+ "       <p id=\"para2\"> Lorem ipsum dolor sit amet consectetur adipisicing elit. Alias quae asperiores temporibus itaque eum doloribus tenetur deserunt quibusdam repellat tempora animi blanditiis, sed fugiat odit modi aliquam ab, obcaecati exercitationem.\r\n"
//    			+ "        Omnis aliquam delectus autem ab soluta inventore earum impedit eaque excepturi sed necessitatibus ipsa commodi, iusto quod voluptates veritatis animi temporibus hic ipsam nulla. Dolores vero officia eaque deserunt explicabo.\r\n"
//    			+ "        Rerum quibusdam laboriosam quis aspernatur similique beatae nobis ut autem sit libero. Soluta ipsum maiores quisquam eveniet animi tenetur ratione, nam in ipsam nihil repellat, modi similique quae? Deserunt, consectetur.\r\n"
//    			+ "        Alias cumque perspiciatis optio, rem hic vero eum, eveniet voluptas explicabo, illum impedit perferendis pariatur nisi rerum beatae cupiditate. Obcaecati consectetur eius rem, voluptatibus fugiat odio placeat maiores earum illum.\r\n"
//    			+ "        </p>\r\n"
//    			+ "        <button onclick=\"action()\">Click</button>\r\n"
//    			+ "        <button onclick=\"reverse()\">Undo</button>\r\n"
//    			+ "        <p class=\"content\">Quos culpa quae quidem est, voluptatem assumenda obcaecati natus nostrum iusto incidunt consectetur voluptates magni velit molestiae sed, soluta neque, atque rerum corrupti molestias! Aut mollitia explicabo labore animi atque.\r\n"
//    			+ "        Ipsam veniam corporis tempora harum expedita earum est, magnam soluta iste nulla cumque culpa hic tempore provident! Eveniet odit laboriosam vel ipsum, consequuntur soluta non quas dolor cum. Quis, saepe.\r\n"
//    			+ "        Cum quod, eius accusantium accusamus vel odio porro nemo velit dolorem aliquam iure quibusdam, architecto sequi sint repellat commodi vero, ducimus hic qui mollitia facere ratione placeat esse maxime. Vitae.\r\n"
//    			+ "        Fuga earum ea cum minus voluptatum quos quam laborum velit autem dolore sed iure dolorum laudantium minima et amet voluptates, voluptatibus distinctio maiores pariatur quibusdam! Corporis aperiam nihil ratione maxime?\r\n"
//    			+ "        Harum illum corrupti consequatur doloremque suscipit animi adipisci eligendi deleniti impedit tempora vitae enim omnis sit debitis, molestiae ipsum! Praesentium repellendus maiores repudiandae nulla molestias ex recusandae deserunt neque. Sunt.\r\n"
//    			+ "        Aliquid mollitia error officiis qui at exercitationem laborum dolorum est recusandae totam ipsam blanditiis nemo, alias ea quod vitae optio neque libero deserunt aliquam aspernatur. Ab, rem. Commodi, ex quis.\r\n"
//    			+ "        Voluptatibus, voluptatum voluptates commodi, quod aperiam deleniti earum debitis fugiat blanditiis nam assumenda reprehenderit repellendus saepe hic accusamus tempora ex, eligendi beatae placeat. Vel voluptatum obcaecati repellendus ipsam quae eius?\r\n"
//    			+ "        Exercitationem fuga quia obcaecati molestias laudantium doloremque, et voluptates, accusamus quisquam sapiente vel voluptatem quas dicta eum dolores, natus velit magni asperiores. Dignissimos est tenetur nemo, voluptate repudiandae sed officiis.\r\n"
//    			+ "    </p>\r\n"
//    			+ "    <script>\r\n"
//    			+ "    function action(){\r\n"
//    			+ "        var x = document.getElementById('para2');\r\n"
//    			+ "               x.innerHTML=\"Rajesh\";\r\n"
//    			+ "               x.style.backgroundColor=\"blue\";\r\n"
//    			+ "               x.style.fontSize='3em';\r\n"
//    			+ "        }\r\n"
//    			+ "        //console.log(x[3].getAttribute('align'));\r\n"
//    			+ "        function reverse(){\r\n"
//    			+ "            var x = document.getElementById('para2');\r\n"
//    			+ "            x.innerHTML='Lorem ipsum dolor sit amet consectetur adipisicing elit. Alias quae asperiores temporibus itaque eum doloribus tenetur deserunt quibusdam repellat tempora animi blanditiis, sed fugiat odit modi aliquam ab, obcaecati exercitationem';\r\n"
//    			+ "            x.style.backgroundColor=\"white\";\r\n"
//    			+ "               x.style.fontSize='1em';\r\n"
//    			+ "        }\r\n"
//    			+ "    </script>\r\n"
//    			+ "    </body>\r\n"
//    			+ "</html>");
	}


	
}
