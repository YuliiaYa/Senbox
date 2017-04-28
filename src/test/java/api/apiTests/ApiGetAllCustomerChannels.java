package api.apiTests;

import api.models.Channel;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class ApiGetAllCustomerChannels {

    @Test

    public void getAllCustomerChannels() {

        RestTemplate restTemplate = new RestTemplate();
      //  RestTemplateJSON restTemplate = new RestTemplateJSON();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        Channel[] channel = restTemplate.getForObject("http://devrc.simplex.tv/webservice/http/rest/client/channels/4231/", Channel[].class);


      //  Channel[] channel = restTemplate.getForObject("http://devrc.simplex.tv/webservice/http/rest/client/channels/4231/", Channel[].class);

       // System.out.println(channel.toString());
       // assertTrue(channel[].length == 0);



    }
}
