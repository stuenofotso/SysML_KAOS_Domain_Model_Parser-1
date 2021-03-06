package SysMLKaosDomainModeling.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Atom;
  private ConceptPresentation props_Attribute;
  private ConceptPresentation props_AttributeAtom;
  private ConceptPresentation props_AttributeMaplet;
  private ConceptPresentation props_Body;
  private ConceptPresentation props_BuiltInAtom;
  private ConceptPresentation props_Cardinality;
  private ConceptPresentation props_Concept;
  private ConceptPresentation props_ConceptAtom;
  private ConceptPresentation props_CustomDataSet;
  private ConceptPresentation props_DataSet;
  private ConceptPresentation props_DataSetAtom;
  private ConceptPresentation props_DataValue;
  private ConceptPresentation props_DefaultDataSet;
  private ConceptPresentation props_DomainCardinality;
  private ConceptPresentation props_DomainModel;
  private ConceptPresentation props_EnumeratedDataSet;
  private ConceptPresentation props_EqualityAtom;
  private ConceptPresentation props_Head;
  private ConceptPresentation props_Individual;
  private ConceptPresentation props_InequalityAtom;
  private ConceptPresentation props_Predicate;
  private ConceptPresentation props_RangeCardinality;
  private ConceptPresentation props_Relation;
  private ConceptPresentation props_RelationAtom;
  private ConceptPresentation props_RelationMaplet;
  private ConceptPresentation props_Term;
  private ConceptPresentation props_Variable;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Atom:
        if (props_Atom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Atom = cpb.create();
        }
        return props_Atom;
      case LanguageConceptSwitch.Attribute:
        if (props_Attribute == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Attribute = cpb.create();
        }
        return props_Attribute;
      case LanguageConceptSwitch.AttributeAtom:
        if (props_AttributeAtom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("AttributeAtom");
          props_AttributeAtom = cpb.create();
        }
        return props_AttributeAtom;
      case LanguageConceptSwitch.AttributeMaplet:
        if (props_AttributeMaplet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("AttributeMaplet");
          props_AttributeMaplet = cpb.create();
        }
        return props_AttributeMaplet;
      case LanguageConceptSwitch.Body:
        if (props_Body == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Body");
          props_Body = cpb.create();
        }
        return props_Body;
      case LanguageConceptSwitch.BuiltInAtom:
        if (props_BuiltInAtom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_BuiltInAtom = cpb.create();
        }
        return props_BuiltInAtom;
      case LanguageConceptSwitch.Cardinality:
        if (props_Cardinality == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("cardinality for a relation. maxCardinality=-1 => the upper bound is infinity");
          props_Cardinality = cpb.create();
        }
        return props_Cardinality;
      case LanguageConceptSwitch.Concept:
        if (props_Concept == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("an entity");
          cpb.presentationByName();
          props_Concept = cpb.create();
        }
        return props_Concept;
      case LanguageConceptSwitch.ConceptAtom:
        if (props_ConceptAtom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ConceptAtom");
          props_ConceptAtom = cpb.create();
        }
        return props_ConceptAtom;
      case LanguageConceptSwitch.CustomDataSet:
        if (props_CustomDataSet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_CustomDataSet = cpb.create();
        }
        return props_CustomDataSet;
      case LanguageConceptSwitch.DataSet:
        if (props_DataSet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_DataSet = cpb.create();
        }
        return props_DataSet;
      case LanguageConceptSwitch.DataSetAtom:
        if (props_DataSetAtom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DataSetAtom");
          props_DataSetAtom = cpb.create();
        }
        return props_DataSetAtom;
      case LanguageConceptSwitch.DataValue:
        if (props_DataValue == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DataValue = cpb.create();
        }
        return props_DataValue;
      case LanguageConceptSwitch.DefaultDataSet:
        if (props_DefaultDataSet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DefaultDataSet = cpb.create();
        }
        return props_DefaultDataSet;
      case LanguageConceptSwitch.DomainCardinality:
        if (props_DomainCardinality == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DomainCardinality");
          props_DomainCardinality = cpb.create();
        }
        return props_DomainCardinality;
      case LanguageConceptSwitch.DomainModel:
        if (props_DomainModel == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("a domain model");
          cpb.presentationByName();
          props_DomainModel = cpb.create();
        }
        return props_DomainModel;
      case LanguageConceptSwitch.EnumeratedDataSet:
        if (props_EnumeratedDataSet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_EnumeratedDataSet = cpb.create();
        }
        return props_EnumeratedDataSet;
      case LanguageConceptSwitch.EqualityAtom:
        if (props_EqualityAtom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("EqualityAtom");
          props_EqualityAtom = cpb.create();
        }
        return props_EqualityAtom;
      case LanguageConceptSwitch.Head:
        if (props_Head == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Head");
          props_Head = cpb.create();
        }
        return props_Head;
      case LanguageConceptSwitch.Individual:
        if (props_Individual == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Individual = cpb.create();
        }
        return props_Individual;
      case LanguageConceptSwitch.InequalityAtom:
        if (props_InequalityAtom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("InequalityAtom");
          props_InequalityAtom = cpb.create();
        }
        return props_InequalityAtom;
      case LanguageConceptSwitch.Predicate:
        if (props_Predicate == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Predicate = cpb.create();
        }
        return props_Predicate;
      case LanguageConceptSwitch.RangeCardinality:
        if (props_RangeCardinality == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("RangeCardinality");
          props_RangeCardinality = cpb.create();
        }
        return props_RangeCardinality;
      case LanguageConceptSwitch.Relation:
        if (props_Relation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Relation = cpb.create();
        }
        return props_Relation;
      case LanguageConceptSwitch.RelationAtom:
        if (props_RelationAtom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("RelationAtom");
          props_RelationAtom = cpb.create();
        }
        return props_RelationAtom;
      case LanguageConceptSwitch.RelationMaplet:
        if (props_RelationMaplet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("RelationMaplet");
          props_RelationMaplet = cpb.create();
        }
        return props_RelationMaplet;
      case LanguageConceptSwitch.Term:
        if (props_Term == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Term = cpb.create();
        }
        return props_Term;
      case LanguageConceptSwitch.Variable:
        if (props_Variable == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Variable = cpb.create();
        }
        return props_Variable;
    }
    return null;
  }
}
