package com.hinkle.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

  public String getQuote(){
    return ChuckNorrisQuotes.getRandomQuote();
  }

}
