// Função exportada ao final

// export default props => {
//     return <h1>Recode Pro {props.ano}!</h1>
// };

// =====================================================================

// função armazenada em variavél ou constante

const Copyright = function (props) {
    return (
        <h1>Recode Pro {props.ano}!</h1>
    )
}
export default Copyright;

// ======================================================================

// função arrow armazenada em variavél ou constante

// const Copyright2 = props => <h1>Recode Pro {props.ano}!</h1>
// export default Copyright2;

// ======================================================================

// Exportação direta de função arrow

// export default props => <h1>Recode Pro {props.ano}!</h1>;