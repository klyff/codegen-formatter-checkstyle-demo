package br.com.zup.dtp.api.restclient;

import br.com.zup.dtp.api.configuration.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(contextId = "LanguageApiClient", name = "${programmingLanguagesList.name:programmingLanguagesList}",
    url = "${programmingLanguagesList.url:https://zup.swagger.io/v2}", configuration = ClientConfiguration.class)
public interface LanguageApiClient extends LanguageApi {
}
