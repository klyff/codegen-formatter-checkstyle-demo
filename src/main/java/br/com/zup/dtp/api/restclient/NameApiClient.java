package br.com.zup.dtp.api.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import br.com.zup.dtp.api.configuration.ClientConfiguration;

@FeignClient(contextId="NameApiClient", name="${programmingLanguagesList.name:programmingLanguagesList}", url="${programmingLanguagesList.url:https://zup.swagger.io/v2}", configuration = ClientConfiguration.class)
public interface NameApiClient extends NameApi {
}
