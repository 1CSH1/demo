package com.example.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * @author James-CSH
 * @since 2/11/2017 10:57 AM
 */
@Configuration
@EnableCaching
public class CacheConfig {

//    @Bean
//    public CacheManager cacheManager() {
//        return new CacheManager();
//    }
//
//    @Bean
//    public EhCacheCacheManager ehcacheManager(CacheManager cacheManager) {
//        return new EhCacheCacheManager(cacheManager);
//    }
}
