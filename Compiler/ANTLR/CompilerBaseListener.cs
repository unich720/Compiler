//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Compiler.g4 by ANTLR 4.9.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419


using Antlr4.Runtime.Misc;
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="ICompilerListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class CompilerBaseListener : ICompilerListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.input"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInput([NotNull] CompilerParser.InputContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.input"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInput([NotNull] CompilerParser.InputContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.input_section"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInput_section([NotNull] CompilerParser.Input_sectionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.input_section"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInput_section([NotNull] CompilerParser.Input_sectionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.input_section_part"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInput_section_part([NotNull] CompilerParser.Input_section_partContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.input_section_part"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInput_section_part([NotNull] CompilerParser.Input_section_partContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.input_element"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInput_element([NotNull] CompilerParser.Input_elementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.input_element"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInput_element([NotNull] CompilerParser.Input_elementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.token"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterToken([NotNull] CompilerParser.TokenContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.token"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitToken([NotNull] CompilerParser.TokenContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.keyword"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterKeyword([NotNull] CompilerParser.KeywordContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.keyword"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitKeyword([NotNull] CompilerParser.KeywordContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.literal"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLiteral([NotNull] CompilerParser.LiteralContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.literal"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLiteral([NotNull] CompilerParser.LiteralContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.boolean_literal"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBoolean_literal([NotNull] CompilerParser.Boolean_literalContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.boolean_literal"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBoolean_literal([NotNull] CompilerParser.Boolean_literalContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="CompilerParser.operator_or_punctuator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOperator_or_punctuator([NotNull] CompilerParser.Operator_or_punctuatorContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="CompilerParser.operator_or_punctuator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOperator_or_punctuator([NotNull] CompilerParser.Operator_or_punctuatorContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
