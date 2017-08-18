/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sparklingpandas.sparklingml.feature

import org.apache.spark.ml.param._
import org.apache.spark.ml.util.Identifiable

import org.apache.lucene.analysis.Analyzer

import com.sparklingpandas.sparklingml.param._

// DO NOT MODIFY THIS FILE!
// It was auto generated by LuceneAnalyzerGenerators.

    
/**
 * A basic Transformer based on ArabicAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class ArabicAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[ArabicAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("ArabicAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.ar.ArabicAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.ar.ArabicAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on BulgarianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class BulgarianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[BulgarianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("BulgarianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.bg.BulgarianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.bg.BulgarianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on BrazilianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class BrazilianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[BrazilianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("BrazilianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.br.BrazilianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.br.BrazilianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on CatalanAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class CatalanAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[CatalanAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("CatalanAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.ca.CatalanAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.ca.CatalanAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on CJKAnalyzer.
 * Supports configuring stopwords.
 */

class CJKAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[CJKAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("CJKAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.cjk.CJKAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.cjk.CJKAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on SoraniAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class SoraniAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[SoraniAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("SoraniAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.ckb.SoraniAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.ckb.SoraniAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on KeywordAnalyzer - does not support
 * any configuration properties.
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 * & LuceneAnalyzerGenerators for details.
 */

class KeywordAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[KeywordAnalyzerLucene] {

  def this() = this(Identifiable.randomUID("KeywordAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    new org.apache.lucene.analysis.core.KeywordAnalyzer()
  }
}

/**
 * A basic Transformer based on SimpleAnalyzer - does not support
 * any configuration properties.
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 * & LuceneAnalyzerGenerators for details.
 */

class SimpleAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[SimpleAnalyzerLucene] {

  def this() = this(Identifiable.randomUID("SimpleAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    new org.apache.lucene.analysis.core.SimpleAnalyzer()
  }
}

/**
 * A basic Transformer based on StopAnalyzer.
 * Supports configuring stopwords.
 */

class StopAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[StopAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("StopAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.core.StopAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.core.StopAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on UnicodeWhitespaceAnalyzer - does not support
 * any configuration properties.
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 * & LuceneAnalyzerGenerators for details.
 */

class UnicodeWhitespaceAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[UnicodeWhitespaceAnalyzerLucene] {

  def this() = this(Identifiable.randomUID("UnicodeWhitespaceAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    new org.apache.lucene.analysis.core.UnicodeWhitespaceAnalyzer()
  }
}

/**
 * A basic Transformer based on WhitespaceAnalyzer - does not support
 * any configuration properties.
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 * & LuceneAnalyzerGenerators for details.
 */

class WhitespaceAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[WhitespaceAnalyzerLucene] {

  def this() = this(Identifiable.randomUID("WhitespaceAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    new org.apache.lucene.analysis.core.WhitespaceAnalyzer()
  }
}

/* There is no default zero arg constructor for
 *org.apache.lucene.analysis.custom.CustomAnalyzer.
 */

/**
 * A basic Transformer based on CzechAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class CzechAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[CzechAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("CzechAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.cz.CzechAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.cz.CzechAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on DanishAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class DanishAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[DanishAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("DanishAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.da.DanishAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.da.DanishAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on GermanAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class GermanAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[GermanAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("GermanAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.de.GermanAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.de.GermanAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on GreekAnalyzer.
 * Supports configuring stopwords.
 */

class GreekAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[GreekAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("GreekAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.el.GreekAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.el.GreekAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on EnglishAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class EnglishAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[EnglishAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("EnglishAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.en.EnglishAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.en.EnglishAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on SpanishAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class SpanishAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[SpanishAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("SpanishAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.es.SpanishAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.es.SpanishAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on BasqueAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class BasqueAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[BasqueAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("BasqueAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.eu.BasqueAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.eu.BasqueAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on PersianAnalyzer.
 * Supports configuring stopwords.
 */

class PersianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[PersianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("PersianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.fa.PersianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.fa.PersianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on FinnishAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class FinnishAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[FinnishAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("FinnishAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.fi.FinnishAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.fi.FinnishAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on FrenchAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class FrenchAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[FrenchAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("FrenchAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.fr.FrenchAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.fr.FrenchAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on IrishAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class IrishAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[IrishAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("IrishAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.ga.IrishAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.ga.IrishAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on GalicianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class GalicianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[GalicianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("GalicianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.gl.GalicianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.gl.GalicianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on HindiAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class HindiAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[HindiAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("HindiAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.hi.HindiAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.hi.HindiAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on HungarianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class HungarianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[HungarianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("HungarianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.hu.HungarianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.hu.HungarianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on ArmenianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class ArmenianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[ArmenianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("ArmenianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.hy.ArmenianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.hy.ArmenianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on IndonesianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class IndonesianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[IndonesianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("IndonesianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.id.IndonesianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.id.IndonesianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on ItalianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class ItalianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[ItalianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("ItalianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.it.ItalianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.it.ItalianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on JapaneseAnalyzer - does not support
 * any configuration properties.
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 * & LuceneAnalyzerGenerators for details.
 */

class JapaneseAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[JapaneseAnalyzerLucene] {

  def this() = this(Identifiable.randomUID("JapaneseAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    new org.apache.lucene.analysis.ja.JapaneseAnalyzer()
  }
}

/**
 * A basic Transformer based on LithuanianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class LithuanianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[LithuanianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("LithuanianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.lt.LithuanianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.lt.LithuanianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on LatvianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class LatvianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[LatvianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("LatvianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.lv.LatvianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.lv.LatvianAnalyzer()
    }
  }
}

/* There is no default zero arg constructor for
 *org.apache.lucene.analysis.miscellaneous.LimitTokenCountAnalyzer.
 */

/* There is no default zero arg constructor for
 *org.apache.lucene.analysis.miscellaneous.PerFieldAnalyzerWrapper.
 */

/**
 * A basic Transformer based on DutchAnalyzer - does not support
 * any configuration properties.
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 * & LuceneAnalyzerGenerators for details.
 */

class DutchAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[DutchAnalyzerLucene] {

  def this() = this(Identifiable.randomUID("DutchAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    new org.apache.lucene.analysis.nl.DutchAnalyzer()
  }
}

/**
 * A basic Transformer based on NorwegianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class NorwegianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[NorwegianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("NorwegianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.no.NorwegianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.no.NorwegianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on PortugueseAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class PortugueseAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[PortugueseAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("PortugueseAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.pt.PortugueseAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.pt.PortugueseAnalyzer()
    }
  }
}

/* There is no default zero arg constructor for
 *org.apache.lucene.analysis.query.QueryAutoStopWordAnalyzer.
 */

/**
 * A basic Transformer based on RomanianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class RomanianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[RomanianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("RomanianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.ro.RomanianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.ro.RomanianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on RussianAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class RussianAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[RussianAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("RussianAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.ru.RussianAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.ru.RussianAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on ShingleAnalyzerWrapper - does not support
 * any configuration properties.
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 * & LuceneAnalyzerGenerators for details.
 */

class ShingleAnalyzerWrapperLucene(override val uid: String)
    extends LuceneTransformer[ShingleAnalyzerWrapperLucene] {

  def this() = this(Identifiable.randomUID("ShingleAnalyzerWrapper"))

  def buildAnalyzer(): Analyzer = {
    new org.apache.lucene.analysis.shingle.ShingleAnalyzerWrapper()
  }
}

/**
 * A basic Transformer based on ClassicAnalyzer.
 * Supports configuring stopwords.
 */

class ClassicAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[ClassicAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("ClassicAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.standard.ClassicAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.standard.ClassicAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on StandardAnalyzer.
 * Supports configuring stopwords.
 */

class StandardAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[StandardAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("StandardAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.standard.StandardAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.standard.StandardAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on UAX29URLEmailAnalyzer.
 * Supports configuring stopwords.
 */

class UAX29URLEmailAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[UAX29URLEmailAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("UAX29URLEmailAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.standard.UAX29URLEmailAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.standard.UAX29URLEmailAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on SwedishAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class SwedishAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[SwedishAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("SwedishAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.sv.SwedishAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.sv.SwedishAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on ThaiAnalyzer.
 * Supports configuring stopwords.
 */

class ThaiAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[ThaiAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("ThaiAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.th.ThaiAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.th.ThaiAnalyzer()
    }
  }
}

/**
 * A basic Transformer based on TurkishAnalyzer.
 * Supports configuring stopwords.
 * There are additional parameters which can not yet be controlled through this API
 * See https://github.com/sparklingpandas/sparklingml/issues/3
 */

class TurkishAnalyzerLucene(override val uid: String)
    extends LuceneTransformer[TurkishAnalyzerLucene]
    with HasStopwords with HasStopwordCase {

  def this() = this(Identifiable.randomUID("TurkishAnalyzer"))

  def buildAnalyzer(): Analyzer = {
    // In the future we can use getDefaultStopWords here to allow people
    // to control the snowball stemmer distinctly from the stopwords.
    // but that is a TODO for later.
    if (isSet(stopwords)) {
      new org.apache.lucene.analysis.tr.TurkishAnalyzer(
        LuceneHelpers.wordstoCharArraySet($(stopwords), !$(stopwordCase)))
    } else {
      new org.apache.lucene.analysis.tr.TurkishAnalyzer()
    }
  }
}

/* There is no default zero arg constructor for
 *org.apache.lucene.collation.CollationKeyAnalyzer.
 */

/* There is no default zero arg constructor for
 *org.apache.lucene.search.suggest.document.CompletionAnalyzer.
 */
